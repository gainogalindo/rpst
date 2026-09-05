# RPST (Refined Process Structure Tree)

This repository contains a standalone, lightweight implementation of the Refined Process Structure Tree (RPST).

**Core Origins**
All core mathematical algorithms, graph structures, and specific dependencies required for the RPST computation, including triconnected component decomposition and Single-Entry, Single-Exit (SESE) region detection, were directly extracted from the [jBPT (Java Business Process Technologies) library](https://github.com/jbpt/codebase).

**Motivation**
This minimal extraction isolates the RPST core from heavy, unnecessary external frameworks (such as ProM visual parsers). By preserving only the essential native Java packages (`org.jbpt.graph`, `org.jbpt.hypergraph`, and `org.jbpt.algo.tree`), this project operates as a fast, dependency-free calculation engine. It is specifically optimized for execution in memory via JPype within Python environments.