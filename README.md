<!--
 * @Author: Zeng GuangYi tgy_scut2021@outlook.com
 * @Date: 2025-01-28 03:13:55
 * @LastEditors: Zeng GuangYi tgy_scut2021@outlook.com
 * @LastEditTime: 2025-01-28 03:27:35
 * @FilePath: /miil-template/README.md
 * @Description: 
 * 
 * Copyright (c) 2025 by ${git_name_email}, All Rights Reserved. 
-->
# chisel + Miil project template
## Dependencies
- [OpenJDK 17](https://openjdk.org/projects/jdk/17/)
- [Scala 2.13.15](https://www.scala-lang.org/download/2.13.15.html)
- [Mill](https://mill-build.org/mill/scalalib/intro.html)

`build.mill` was copied from [chisel-playground](https://github.com/OSCPU/chisel-playground/blob/master/build.sc)

## Usage
to generate SystemVerilog file, run:
```bash
miil -i Adder.runMain Main --target-dir ./build
```

Then you will see `Adder.sv` in `build/` if all the things done correctly.