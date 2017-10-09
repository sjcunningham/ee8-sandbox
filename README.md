#  A quick glance at Java EE 8

In these days, the most exciting news is Java 9 reaches GA, as well as the release of the long-waiting Java EE 8 and Glassfish v5. For more details, please read the official announcement [Java EE 8 and GlassFish 5.0 Released!](https://blogs.oracle.com/theaquarium/java-ee-8-is-final-and-glassfish-50-is-released) from Oracle blog portal.

## A brief intro of Java EE 8

The world was changed so quickly, after Java EE 7 was born in 2013, Cloud service and microservice became more and more popular. Java EE had to embrace the changes, so a lot of perspectives are proposed to be brought into Java EE 8, including Configuration, Load Balance, Circuit breaker, Service Registry and Discovery, programnatic Security API, MVC etc. 

But the road to Java EE 8 is not straight, most of proposed specfications are moved out of Java EE 8 in development progress. In a long period, the development of some specifications were paused for some unknown reasons. 

To save Java EE, the [Java community](https://javaee-guardians.io/) created a [petition](https://www.change.org/p/larry-ellison-tell-oracle-to-move-forward-java-ee-as-a-critical-part-of-the-global-it-industry) and wished Oracle can move forward Java EE more quickly.

At the same time, IBM, Redhat and other Java communities launched a new [MicroProfile](http://microprofile.io) which targets ligthweight Java EE and Cloud computing service. Now it is a project under Eclipse foundation.

Although the Java EE 8 way is a little hard, finally it is released to the public. 

And surprisingly Oracle decided to [open up Java EE progress](https://blogs.oracle.com/theaquarium/opening-up-java-ee) and [move it to Eclipse foundation](https://blogs.oracle.com/theaquarium/opening-up-ee-update). [An updated petition](https://www.change.org/p/larry-ellison-tell-oracle-to-move-forward-java-ee-as-a-critical-part-of-the-global-it-industry/u/21473794?utm_medium=email&utm_source=petition_update&utm_campaign=146669&sfmc_tk=xZ%2f6z4TGoQ02piKnRtK%2bejNgWC%2bWD6nr3P%2bcjkRrgGJqXJLLTSlXDQ6alq40O5pe&j=146669&sfmc_sub=46994739&l=32_HTML&u=27789648&mid=7259882&jb=1) was created to help moving Java EE to Eclipse more smoothly.

Java EE 8 should be the last version released by Oracle(and Sun).

## What is new in Java EE 8

Like me, some developers are a little disappointed about Java EE 8(JSR 366) , even complain it comes a little late. But no doubt there are still lots of new features and improvements which are valuable to update ourselves.

Tow new specifications were introduced in Java EE 8.

* JSR 375 – Java EE Security API 1.0
* JSR 367 – The Java API for JSON Binding (JSON-B) 1.0

Some specifications have been updated to align with Java 8 and CDI or involved as a maintainance release.

* JSR 365 – Contexts and Dependency Injection (CDI) 2.0
* JSR 369 – Java Servlet 4.0
* JSR 370 – Java API for RESTful Web Services (JAX-RS) 2.1
* JSR 372 – JavaServer Faces (JSF) 2.3
* JSR 374 – Java API for JSON Processing (JSON-P)1.1
* JSR 380 – Bean Validation 2.0
* JSR 250 – Common Annotations 1.3
* JSR 338 – Java Persistence 2.2
* JSR 356 – Java API for WebSocket 1.1
* JSR 919 – JavaMail 1.6

Other specifications such as JMS, Batch have no updates in this version.

Unfortunately, MVC(JSR 371) is vetoed in the final stage, but it is still existed as a community based specification. And JCache(JSR 107) which had missed the last train of Java EE 7, and also lost its attractiveness in Java EE 8.
  
## Example codes (WIP)

Please see [Wiki pages](https://github.com/hantsy/ee8-sandbox/wiki) for more details.

## Reference 

* [Java EE 8 and GlassFish 5.0 Released!](https://blogs.oracle.com/theaquarium/java-ee-8-is-final-and-glassfish-50-is-released), the Oracle official announcement.
* [The new home page of Java EE on Github](https://javaee.github.io/)
* [Java EE 8 Tutorial](https://javaee.github.io/tutorial/), the official Java EE tutorial.
* [Download Glassfish v5](https://javaee.github.io/glassfish/download)
* [Java EE 8 SDK](http://www.oracle.com/technetwork/java/javaee/downloads/index.html), including the open-source Glassfish distribution, samples, tutorials.
* [Tour around Weld 3](http://weld.cdi-spec.org/news/2017/05/19/tour-around-weld-3/)
* [What's new in JSF 2.3? ](http://arjan-tijms.omnifaces.org/p/jsf-23.html), a must-read article when upgrading to JSF 2.3.
* [MicroProfile](http://microprofile.io) 
* [Java EE Guardians](https://javaee-guardians.io/)
* [Tell Oracle to Move Forward Java EE as a Critical Part of the Global IT Industry](https://www.change.org/p/larry-ellison-tell-oracle-to-move-forward-java-ee-as-a-critical-part-of-the-global-it-industry)
* [Opening up Java EE](https://blogs.oracle.com/theaquarium/opening-up-java-ee)
* [Opening up Java EE - An update](https://blogs.oracle.com/theaquarium/opening-up-ee-update)
* [We Need Your Help - Moving Java EE to the Eclipse Foundation](https://www.change.org/p/larry-ellison-tell-oracle-to-move-forward-java-ee-as-a-critical-part-of-the-global-it-industry/u/21473794?utm_medium=email&utm_source=petition_update&utm_campaign=146669&sfmc_tk=xZ%2f6z4TGoQ02piKnRtK%2bejNgWC%2bWD6nr3P%2bcjkRrgGJqXJLLTSlXDQ6alq40O5pe&j=146669&sfmc_sub=46994739&l=32_HTML&u=27789648&mid=7259882&jb=1)
