# cljs-1469

To reproduce build your project once: 

    ./scripts/build

You should get a Null Pointer Exception.

After applying the patch, chaning the ClojureScript dependency 
and using `./script/build` again, you should get the output files 
under `out` as described in the introductory
[Modules Post](http://swannodette.github.io/2015/02/23/hello-google-closure-modules/).
