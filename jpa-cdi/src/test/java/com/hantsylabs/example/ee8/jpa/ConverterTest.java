/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hantsylabs.example.ee8.jpa;

import java.util.Arrays;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author hantsy
 */
@RunWith(Arquillian.class)
public class ConverterTest {

    @Deployment(name = "test")
    public static Archive<?> createDeployment() {
        JavaArchive archive = ShrinkWrap.create(JavaArchive.class)
                //domain.support package.
                .addClasses(Post.class, ConverterUtils.class, TagsConverter.class, Fixtures.class, Resources.class)
                .addAsManifestResource("META-INF/test-persistence.xml", "persistence.xml")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        // System.out.println(archive.toString(true));
        return archive;
    }

    @Inject
    ConverterUtils utils;

    @PersistenceContext
    EntityManager entityManager;

    @Inject
    UserTransaction utx;

    @Test
    public void testConverUtils() {
        assertNotNull(utils);
        assertEquals("test,test1", utils.listToString(Arrays.asList("test", "test1")));
        assertEquals(Arrays.asList("test", "test1"), utils.stringToList("test,test1"));
    }

    @Test
    public void testEntityManager() throws Exception {
        assertNotNull(entityManager);
        utx.begin();
        entityManager.joinTransaction();
        Post _post = Fixtures.newPost("test", "test content");
        entityManager.persist(_post);

        assertNotNull(_post.getId());
        utx.commit();
    }
}
