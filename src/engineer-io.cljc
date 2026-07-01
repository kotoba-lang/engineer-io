(ns engineer-io
  "Zero-dep portable CLJC. Restored from the legacy kami-engine/kami-eng-* Rust
  crates (deleted in kotoba-lang/kami-engine #82 'Remove Rust workspace from
  kami-engine') as part of the clj-wgsl migration (ADR-2607010930,
  com-junkawasaki/root). Native execution stays substrate; this namespace
  owns the CLJC contracts / data interpreters / EDN IR for the domain.

  CAD/EDA file-format I/O: STEP, IGES, STL, Gerber, G-code, Verilog, VHDL, SPICE, VCD, EDIF, LEF/DEF readers/writers. Depends on kotoba-lang/engineer for shared contracts.")
