package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.circuitsw.impl.rev151013;

import org.opendaylight.ofextensions.circuitsw.impl.CircuitswProvider;

public class CircuitswModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.circuitsw.impl.rev151013.AbstractCircuitswModule {
    public CircuitswModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public CircuitswModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.circuitsw.impl.rev151013.CircuitswModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        CircuitswProvider csProvider = new CircuitswProvider();
        return csProvider;
        //throw new java.lang.UnsupportedOperationException();
    }

}
