package adder

import chisel3._
// import circt.stage.ChiselStage

class Adder extends Module {
    val io = IO(new Bundle {
        val a = Input(UInt(8.W))
        val b = Input(UInt(8.W))
        val o = Output(UInt(8.W))
    })
    io.o := io.a + io.b
}

