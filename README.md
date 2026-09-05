# RPST (Refined Process Structure Tree)
This repository provides a standalone, lightweight extraction and adaptation of the Refined Process Structure Tree (RPST) implementation from the [jBPT (Java Business Process Technologies) library](https://github.com/jbpt/codebase).

## Origin and Attribution
The RPST algorithms and supporting graph data structures contained in this repository originate from the jBPT project. In particular, the core algorithms required for RPST computation, including triconnected component decomposition and Single-Entry, Single-Exit (SESE) region detection, as well as the supporting graph and hypergraph structures, were extracted and adapted from the original jBPT codebase.

This project does not claim authorship of the original jBPT algorithms or their implementations. Credit for the original implementation belongs to the jBPT project and its respective authors and contributors.

Original project:
- jBPT — Java Business Process Technologies
- https://github.com/jbpt/codebase

## Motivation and Modifications

The purpose of this repository is to provide a substantially reduced version of the jBPT codebase containing only the components required for RPST computation.

Packages and classes unrelated to this purpose were removed, and the remaining code was organized as a small calculation engine intended primarily for in-memory use from Python through JPype.

Consequently, this repository should be regarded as a minimal adaptation of the relevant portions of jBPT rather than as an independent implementation of the RPST algorithms.

## License

The original jBPT codebase is distributed under the GNU Lesser General Public License version 3 (LGPL-3.0).

The portions of jBPT redistributed and modified in this repository remain subject to the terms of the GNU LGPL v3. See the LICENSE file included with this repository for the complete license text.

Copyright and attribution notices originating from jBPT remain applicable to the corresponding derived source code.


## Notice

This repository is not affiliated with, endorsed by, or maintained by the original jBPT project.

For detailed information about the origin of the source code, retained components, authorship, and modifications made in this repository, see [NOTICE.md](NOTICE.md).
