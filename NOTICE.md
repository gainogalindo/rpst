# NOTICE

This repository contains source code derived from the **jBPT (Java Business Process Technologies)** project.

## Original Project

jBPT — Java Business Process Technologies
https://github.com/jbpt/codebase

The original jBPT project is distributed under the **GNU Lesser General Public License version 3 (LGPL-3.0)**.

Copyright (c) 2008-2019 jBPT contributors.

## Derived Components

The Java source code under the `org.jbpt` namespace in this repository originates from, or is derived from, components of the jBPT codebase.

The retained source code primarily includes components required for the computation of the Refined Process Structure Tree (RPST), including:
- graph and hypergraph data structures;
- RPST-related tree structures and algorithms;
- triconnected component decomposition;
- supporting utility classes required by these components.

The following jBPT package areas are currently retained in reduced form:
- `org.jbpt.algo.tree`
- `org.jbpt.graph`
- `org.jbpt.hypergraph`
- `org.jbpt.utils`

These components remain attributable to the original jBPT project and its respective authors and contributors.

## Modifications in This Repository

This repository is a reduced and adapted distribution intended specifically for RPST computation.

The work performed in this repository includes, among other changes:
- removal of jBPT modules and classes not required for RPST computation;
- removal of unrelated external dependencies;
- reduction of the original codebase to the minimum set of graph, hypergraph, tree, and utility structures required by the retained RPST implementation;
- adaptation of the resulting project into a lightweight standalone Java component;
- configuration for compilation and use with Java 8;
- organization for in-memory integration with Python through JPype.

These modifications do not imply authorship of the original jBPT algorithms or source code from which the retained components were derived.

## Authorship

Authorship and copyright of source code originating from jBPT remain with the original jBPT authors and contributors.

The maintainer of this repository is responsible for the extraction, reduction, adaptation, integration, build configuration, and repository-specific code introduced as part of this project.

## License

The jBPT-derived portions of this repository remain subject to the terms of the **GNU Lesser General Public License version 3 (LGPL-3.0)**.

See the `LICENSE` file distributed with this repository for the complete license terms.

This repository is not affiliated with, endorsed by, or maintained by the original jBPT project.
