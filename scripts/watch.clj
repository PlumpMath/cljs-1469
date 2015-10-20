(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-1469.core
   :output-to "out/cljs_1469.js"
   :output-dir "out"})
