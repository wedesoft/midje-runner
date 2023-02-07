(ns midje-runner.runner
  (:require [midje.repl :as mr]))

(defn -main [& args]
  (let [result (mr/load-facts :all)]
    (System/exit (if (zero? (:failures result)) 0 1))))
