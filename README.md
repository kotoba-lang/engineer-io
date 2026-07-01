# kotoba-lang/engineer-io

Zero-dep portable `.cljc` — restored from the legacy `kami-engine/kami-eng-*`
Rust crates (deleted in kotoba-lang/kami-engine PR #82 "Remove Rust workspace
from kami-engine") as part of the **clj-wgsl migration** (ADR-2607010930,
`com-junkawasaki/root`).

CAD/EDA file-format I/O: STEP, IGES, STL, Gerber, G-code, Verilog, VHDL, SPICE, VCD, EDIF, LEF/DEF readers/writers. Depends on kotoba-lang/engineer for shared contracts.

## Status

Scaffold only — the CLJC restoration is pending. This repo provides the home
for the zero-dep portable `.cljc` contracts / data interpreters / EDN IR
that replace the deleted Rust crate. Native execution (wgpu / wasmtime /
wasmi), where needed, stays substrate.

## Develop

```bash
clojure -M:test
```
