(ns package
  (:require [badigeon.bundle :refer [bundle make-out-path]]
            [badigeon.compile :as c]))

(defn -main []
      (bundle (make-out-path 'lib nil))
      (c/compile 'myapp.core {:compile-path "target/classes"}))