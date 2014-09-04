(ns clj-t.core-test
  (:require [clj-time.format :as f]
            [clj-time.core :as t]
            [clojure.test :refer :all]
            [clj-t.core :refer :all]))

(deftest d-of-day-test
  (testing "FIXME, I fail."
    (is (= 7 (d-of-day "20140101" "20140108")))
    (is (= 12 (let [f (f/formatter "yyyy-MM-dd" (t/time-zone-for-id "Asia/Shanghai"))]
                (d-of-day "2014-01-01" "2014-01-13" f))
           ))))
