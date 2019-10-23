(ns myapp.core
  (:require [ivarref.aot-debug :as dbg])
  (:gen-class)
  (:import (java.lang.management ManagementFactory)))

(defn -main [& args]
  (println "JVM booted in" (.getUptime (ManagementFactory/getRuntimeMXBean)) "ms")
  (dbg/foo "aot debug"))
