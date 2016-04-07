(ns coin-changer.core)

(defn coin-change [cents]
  (loop [cents  cents
         change []]
    (if (= cents 0)
      change
      (cond
        (>= cents 25)
          (recur (- cents 25) (conj change 25))
        (>= cents 10)
          (recur (- cents 10) (conj change 10))
        (>= cents 5)
          (recur (- cents 5) (conj change 5))
        :else
          (recur (dec cents) (conj change 1))))))
