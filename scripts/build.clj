(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:optimizations :advanced
     :output-dir "out"
     :verbose true
     :modules {:foo {:output-to "out/foo.js"
                     :entries #{"cljs-1469.core"}}
               :bar {:output-to "out/hello.js"
                     :entries #{"cljs-1469.hello"}}}})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


