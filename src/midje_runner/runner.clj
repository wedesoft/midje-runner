(ns midje-runner.runner
  (:require [midje.repl :as mr]))

(defn -main [& args]
  (let [result (apply mr/load-facts (map read-string args))]
    (System/exit (if (zero? (:failures result)) 0 1))))
