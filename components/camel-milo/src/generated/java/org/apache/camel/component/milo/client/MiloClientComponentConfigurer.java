/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.client;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MiloClientComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("clientId", java.lang.String.class);
        map.put("configuration", org.apache.camel.component.milo.client.MiloClientConfiguration.class);
        map.put("discoveryEndpointSuffix", java.lang.String.class);
        map.put("discoveryEndpointUri", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("allowedSecurityPolicies", java.lang.String.class);
        map.put("applicationName", java.lang.String.class);
        map.put("applicationUri", java.lang.String.class);
        map.put("channelLifetime", java.lang.Long.class);
        map.put("keyAlias", java.lang.String.class);
        map.put("keyPassword", java.lang.String.class);
        map.put("keyStorePassword", java.lang.String.class);
        map.put("keyStoreType", java.lang.String.class);
        map.put("keyStoreUrl", java.lang.String.class);
        map.put("maxPendingPublishRequests", java.lang.Long.class);
        map.put("maxResponseMessageSize", java.lang.Long.class);
        map.put("overrideHost", boolean.class);
        map.put("productUri", java.lang.String.class);
        map.put("requestedPublishingInterval", java.lang.Double.class);
        map.put("requestTimeout", java.lang.Long.class);
        map.put("sessionName", java.lang.String.class);
        map.put("sessionTimeout", java.lang.Long.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.milo.client.MiloClientConfiguration getOrCreateConfiguration(MiloClientComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.milo.client.MiloClientConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MiloClientComponent target = (MiloClientComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedsecuritypolicies":
        case "allowedSecurityPolicies": getOrCreateConfiguration(target).setAllowedSecurityPolicies(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationuri":
        case "applicationUri": getOrCreateConfiguration(target).setApplicationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channellifetime":
        case "channelLifetime": getOrCreateConfiguration(target).setChannelLifetime(property(camelContext, java.lang.Long.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.milo.client.MiloClientConfiguration.class, value)); return true;
        case "discoveryendpointsuffix":
        case "discoveryEndpointSuffix": getOrCreateConfiguration(target).setDiscoveryEndpointSuffix(property(camelContext, java.lang.String.class, value)); return true;
        case "discoveryendpointuri":
        case "discoveryEndpointUri": getOrCreateConfiguration(target).setDiscoveryEndpointUri(property(camelContext, java.lang.String.class, value)); return true;
        case "keyalias":
        case "keyAlias": getOrCreateConfiguration(target).setKeyAlias(property(camelContext, java.lang.String.class, value)); return true;
        case "keypassword":
        case "keyPassword": getOrCreateConfiguration(target).setKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keystorepassword":
        case "keyStorePassword": getOrCreateConfiguration(target).setKeyStorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoretype":
        case "keyStoreType": getOrCreateConfiguration(target).setKeyStoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "keystoreurl":
        case "keyStoreUrl": getOrCreateConfiguration(target).setKeyStoreUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxpendingpublishrequests":
        case "maxPendingPublishRequests": getOrCreateConfiguration(target).setMaxPendingPublishRequests(property(camelContext, java.lang.Long.class, value)); return true;
        case "maxresponsemessagesize":
        case "maxResponseMessageSize": getOrCreateConfiguration(target).setMaxResponseMessageSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "overridehost":
        case "overrideHost": getOrCreateConfiguration(target).setOverrideHost(property(camelContext, boolean.class, value)); return true;
        case "producturi":
        case "productUri": getOrCreateConfiguration(target).setProductUri(property(camelContext, java.lang.String.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": getOrCreateConfiguration(target).setRequestTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "requestedpublishinginterval":
        case "requestedPublishingInterval": getOrCreateConfiguration(target).setRequestedPublishingInterval(property(camelContext, java.lang.Double.class, value)); return true;
        case "sessionname":
        case "sessionName": getOrCreateConfiguration(target).setSessionName(property(camelContext, java.lang.String.class, value)); return true;
        case "sessiontimeout":
        case "sessionTimeout": getOrCreateConfiguration(target).setSessionTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MiloClientComponent target = (MiloClientComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedsecuritypolicies":
        case "allowedSecurityPolicies": return getOrCreateConfiguration(target).getAllowedSecurityPolicies();
        case "applicationname":
        case "applicationName": return getOrCreateConfiguration(target).getApplicationName();
        case "applicationuri":
        case "applicationUri": return getOrCreateConfiguration(target).getApplicationUri();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channellifetime":
        case "channelLifetime": return getOrCreateConfiguration(target).getChannelLifetime();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "configuration": return target.getConfiguration();
        case "discoveryendpointsuffix":
        case "discoveryEndpointSuffix": return getOrCreateConfiguration(target).getDiscoveryEndpointSuffix();
        case "discoveryendpointuri":
        case "discoveryEndpointUri": return getOrCreateConfiguration(target).getDiscoveryEndpointUri();
        case "keyalias":
        case "keyAlias": return getOrCreateConfiguration(target).getKeyAlias();
        case "keypassword":
        case "keyPassword": return getOrCreateConfiguration(target).getKeyPassword();
        case "keystorepassword":
        case "keyStorePassword": return getOrCreateConfiguration(target).getKeyStorePassword();
        case "keystoretype":
        case "keyStoreType": return getOrCreateConfiguration(target).getKeyStoreType();
        case "keystoreurl":
        case "keyStoreUrl": return getOrCreateConfiguration(target).getKeyStoreUrl();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxpendingpublishrequests":
        case "maxPendingPublishRequests": return getOrCreateConfiguration(target).getMaxPendingPublishRequests();
        case "maxresponsemessagesize":
        case "maxResponseMessageSize": return getOrCreateConfiguration(target).getMaxResponseMessageSize();
        case "overridehost":
        case "overrideHost": return getOrCreateConfiguration(target).isOverrideHost();
        case "producturi":
        case "productUri": return getOrCreateConfiguration(target).getProductUri();
        case "requesttimeout":
        case "requestTimeout": return getOrCreateConfiguration(target).getRequestTimeout();
        case "requestedpublishinginterval":
        case "requestedPublishingInterval": return getOrCreateConfiguration(target).getRequestedPublishingInterval();
        case "sessionname":
        case "sessionName": return getOrCreateConfiguration(target).getSessionName();
        case "sessiontimeout":
        case "sessionTimeout": return getOrCreateConfiguration(target).getSessionTimeout();
        default: return null;
        }
    }
}

