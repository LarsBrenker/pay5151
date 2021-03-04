/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Application;

@ApplicationScoped
@javax.ws.rs.ApplicationPath("/")
@OpenAPIDefinition(info = @Info(
        title = "payara-5151-reproducer",
        description = "payara-5151-reproducer",
        version = "1.0-SNAPSHOT"
)
)
public class ApplicationConfig extends Application {

}
