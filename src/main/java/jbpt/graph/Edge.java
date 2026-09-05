package jbpt.graph;

import jbpt.graph.abs.AbstractEdge;
import jbpt.graph.abs.AbstractMultiGraph;
import jbpt.hypergraph.abs.Vertex;

/**
 * Graph edge implementation
 *
 * @author Artem Polyvyanyy
 */
public class Edge extends AbstractEdge<Vertex>
{
    protected Edge(AbstractMultiGraph<?, Vertex> g, Vertex v1, Vertex v2) {
        super(g, v1, v2);
    }
}