(ns engineer-io-test
  (:require [clojure.test :refer [deftest is testing]]
            [engineer-io]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? engineer-io))))
