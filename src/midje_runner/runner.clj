(ns midje-runner.runner
  (:require [midje.repl :as mr]))

(defn -main [& args]
  (mr/load-facts :all)
  (System/exit 0))
