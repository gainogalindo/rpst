package jbpt.graph;

import jbpt.graph.abs.AbstractDirectedEdge;
import jbpt.graph.abs.AbstractMultiDirectedGraph;
import jbpt.hypergraph.abs.Vertex;

/**
 * Directed edge implementation
 *
 * @author Artem Polyvyanyy
 */
public class DirectedEdge extends AbstractDirectedEdge<Vertex>
{
    protected DirectedEdge(AbstractMultiDirectedGraph<?, Vertex> g, Vertex source, Vertex target) {
        super(g, source, target);
    }
}