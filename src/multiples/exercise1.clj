(ns multiples.exercise1)

  (defn sum [numbers]
    (reduce + numbers))

  (defn divisible3or5 [number]
    (if (or (= 0 (mod number 3)) (= 0 (mod number 5)) ) number 0))

  (defn multiples [range]
    (sum (mapv divisible3or5 range)))


(ns multiples.exercise2)

  (defn fib [a b]
    (cons a (lazy-seq (fib b (+ b a)))))

  (defn sum_even [numbers]
    (reduce + (filter even? numbers)))

  (defn less_than_4million? [number]
    (< number 4000000))

  (defn total []
    (sum_even (take-while less_than_4million? (fib 1 1))))

(ns multiples.exercise3)

  (require '[clojure.string :as s])

  (defn palindrome? [number]
      (= (s/reverse (str number)) (str number)))

  (defn all-products []
    (for [x (range 100 1000) y (range 100 1000)] (* x y)))

  (defn all-palindromes []
    (filter palindrome? (all-products)))

  (defn biggest-palindrome []
    (apply max (all-palindromes)))

