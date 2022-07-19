(ns prime-factor.core.test
  (:require [clojure.test :refer [are deftest]]
            [prime-factor.core :refer [prime-factors]]))


(deftest test-prime-factors
  (are
   [input expected]
   (= expected (prime-factors input))
    1 []))
