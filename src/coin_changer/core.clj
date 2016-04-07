(ns coin-changer.core)

(defn coin-change [cents]
  (loop [cents  cents
         change '()]
    (if (= 0 cents)
      (into [] change)
      (if (= 5 cents)
        (recur (- cents 5) (conj change 5))
        (recur (dec cents) (conj change 1))))))
