/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaproxies.app.dynamicjdk;

import javaproxies.app.Math;

import java.lang.reflect.Proxy;

public class App {
    public static void main(String[] args) {

        System.out.println("App...");
        Math math = new Math("math");
        ISubjectProxyHandler subjectProxyHandler = new ISubjectProxyHandler(math);
        ISubject subjectProxy = (ISubject) Proxy.newProxyInstance(
                Math.class.getClassLoader(),
                new Class[]{ISubject.class},
                subjectProxyHandler);
        System.out.println(subjectProxy.getName());

    }
}
