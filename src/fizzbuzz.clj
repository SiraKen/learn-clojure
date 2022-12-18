(ns fizzbuzz)

;; ループ回数
(def iter 50)

;; cond
(defn fizzbuzz-cond [n]
  (cond
    (= (mod n 15) 0) "FizzBuzz"
    (= (mod n  5) 0) "Buzz"
    (= (mod n  3) 0) "Fizz"
    :else n))

(for [x (range 1 iter)]
  (fizzbuzz-cond x))

;; if
(defn fizzbuzz-if [x]
  (if (= (mod x 15) 0) "FizzBuzz"
      (if (= (mod x 5) 0) "Buzz"
          (if (= (mod x 3) 0) "Fizz" x))))

(for [x (range 1 iter)]
  (fizzbuzz-if x))
