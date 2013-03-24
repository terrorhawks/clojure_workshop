(ns multiples.exercise1
  (:use clojure.test
        multiples.exercise1))
 
(deftest example-test
  (testing "multiples"

    (is (divisible3or5 3) 3)

    (is (divisible3or5 5) 5)

    (is (divisible3or5 2) nil)
    
    (is (sum [1 2 3]) 6)
    
    (is (multiples (take 10 (range))) 23)

))