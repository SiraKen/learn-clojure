(defn fizzbuzz [n]
  (cond
    (= (mod n 15) 0) "FizzBuzz"
    (= (mod n  5) 0) "Buzz"
    (= (mod n  3) 0) "Fizz"
    :else n))

;; FIXME: ぬるぽ(ｶﾞｯ
((dotimes [i 50]
   (println (fizzbuzz i))))
