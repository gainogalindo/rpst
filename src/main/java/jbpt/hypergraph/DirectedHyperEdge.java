package jbpt.hypergraph;

import jbpt.hypergraph.abs.AbstractDirectedHyperEdge;
import jbpt.hypergraph.abs.AbstractMultiDirectedHyperGraph;
import jbpt.hypergraph.abs.Vertex;

/**
 * Directed hyper edge implementation
 * Directed hyper edge is two typed sets of vertices: source and target vertices
 *
 * @author Artem Polyvyanyy
 */
public class DirectedHyperEdge extends AbstractDirectedHyperEdge<Vertex>
{
    protected DirectedHyperEdge(AbstractMultiDirectedHyperGraph<?, ?> g) {
        super(g);
    }
}