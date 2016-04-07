(ns coin-changer.core-test
  (:require [clojure.test :refer :all]
            [coin-changer.core :refer :all]))

(deftest coin-changer-tests
  (testing "Coin changer returns an empty collection if no cents are given"
    (is (empty? (coin-change 0))))

  (testing "Coin changer will return 1 penny if 1 cents are given"
    (is (= [1] (coin-change 1))))

  (testing "Coin changer will return 2 pennies if 2 cents are given")
    (is (= [1 1] (coin-change 2)))

  (testing "Coin changer will return a nickel if 5 cents are given")
    (is (= [5] (coin-change 5)))

  (testing "Coin changer will return a nickel and a penny if 6 cents are given")
    (is (= [5 1] (coin-change 6)))
  )
