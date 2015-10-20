(ns cljs-1469.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :refer [timeout chan >! <!]]))

(enable-console-print!)

(def c (chan))

(go
  (<! (timeout 1000))
  (println "Hello world!"))

(go
  (<! c)
  (println "Goodbye!"))

(go
  (>! c :knock))
