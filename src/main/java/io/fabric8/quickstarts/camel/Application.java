/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package io.fabric8.quickstarts.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// load regular Spring XML file from the classpath that contains the Camel XML DSL
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application {

    /**
     * A main method to start this application.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    ServletRegistrationBean servletRegistrationBean() {
//        ServletRegistrationBean servlet = new ServletRegistrationBean(
//            new CamelHttpTransportServlet(), "/people-api/*");
//        servlet.setName("CamelServlet");
//        return servlet;
//    }
//
//    @Component
//    class RestApi extends RouteBuilder {
//
//        @Override
//        public void configure() {
//            restConfiguration()
//                .contextPath("/people-api").apiContextPath("/people-api-doc")
//                    .apiProperty("api.title", "People REST API")
//                    .apiProperty("api.version", "1.0")
//                    .apiProperty("api.description", "A list of people from the Camel Project")
//                    .apiProperty("cors", "true")
//                    .apiContextRouteId("doc-api")
//                    .dataFormatProperty("prettyPrint", "true")
//                .component("servlet")
//                .bindingMode(RestBindingMode.json);
//
//            rest("/books").description("Books REST service")
//                .get("/").description("The list of all the books")
//                    .route().routeId("books-api")
//                    .to("sql:select distinct description from orders?" +
//                        "dataSource=dataSource&" +
//                        "outputClass=org.jboss.example.fuse.fis_camel_springboot_rest.Book")
//                    .endRest()
//                .get("order/{id}").description("Details of an order by id")
//                    .route().routeId("order-api")
//                    .to("sql:select * from orders where id = :#${header.id}?" +
//                        "dataSource=dataSource&outputType=SelectOne&" +
//                        "outputClass=org.jboss.example.fuse.fis_camel_springboot_rest.Order");
//        }
//    }

}