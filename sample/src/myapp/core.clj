(ns myapp.core
  (:require [com.walmartlabs.lacinia.pedestal :as lacinia])
  (:gen-class)
  (:import (java.lang.management ManagementFactory)))

(defn -main [& args]
  (println "JVM booted in" (.getUptime (ManagementFactory/getRuntimeMXBean)) "ms"))
