(ns coin-changer.core-test
  (:require [clojure.test :refer :all]
            [coin-changer.core :refer :all]))

(deftest returns-empty
  (testing "Coin changer returns an empty collection if no cents are given"
    (is (empty? (coin-change 0)))))

(deftest returns-1-penny
  (testing "Coin changer returns 1 penny if 1 cents are given"
    (is (= [1] (coin-change 1)))))

(deftest returns-2-pennies
  (testing "Coin changer returns 2 pennies if 2 cents are given")
    (is (= [1 1] (coin-change 2))))

(deftest returns-1-nickel
  (testing "Coin changer returns a nickel if 5 cents are given")
    (is (= [5] (coin-change 5))))

(deftest returns-1-nickel-1-penny
  (testing "Coin changer returns a nickel and a penny if 6 cents are given")
    (is (= [5 1] (coin-change 6))))

(deftest returns-1-nickel-4-pennies
  (testing "Coin changer returns a nickel and 4 pennies if 9 cents are given")
    (is (= [5 1 1 1 1] (coin-change 9))))

(deftest returns-1-dime
  (testing "Coin changer returns a dime if 10 cents are given")
    (is (= [10] (coin-change 10))))

(deftest returns-1-dime-1-penny
  (testing "Coin changer returns a dime and a penny if 11 cents are given")
    (is (= [10 1] (coin-change 11))))

(deftest returns-1-dime-1-nickel
  (testing "Coin changer returns a dime and a nickel if 15 cents are given")
    (is (= [10 5] (coin-change 15))))

(deftest returns-1-dime-1-nickel-1-penny
  (testing "Coin changer returns a dime, a nickel, and a penny if 16 cent are given")
    (is (= [10 5 1] (coin-change 16))))

(deftest returns-2-dimes
  (testing "Coin changer returns 2 dimes if 20 cents are given")
    (is (= [10 10] (coin-change 20))))

(deftest returns-1-quarter
  (testing "Coin changer returns a quarter if 25 cents are given")
    (is (= [25] (coin-change 25))))

(deftest returns-change-for-99-cents
  (testing "Coin changer returns 3 quarters 2 dimes and 4 pennies if 99 cents are given")
    (is (= [25 25 25 10 10 1 1 1 1] (coin-change 99))))
