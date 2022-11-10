;; 足し算
(defn add [x y]
  (+ x y))

;; 引き算
(defn sub [x y]
  (- x y))

;; 掛け算
(defn mul [x y]
  (* x y))

;; 割り算
(defn div [x y]
  (/ x y))

;; 条件分岐
(defn if-sample []
  (def x 3)
  (def y 4)
  (if (> x y)
    (println (str x " is greater than " y))
    (println (str x " is less than " y))))

;; メイン関数
(defn main []
  (println (str "add: " (add 1 2)))
  (println (str "sub: " (sub 5 3)))
  (println (str "mul: " (mul 8 7)))
  (println (str "div: " (div 4 2)))
  (if-sample))

(main)
