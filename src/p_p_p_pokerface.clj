(ns p-p-p-pokerface)

(def face-cards {\T 10, \J 11, \Q 12, \K 13, \A 14})

(defn rank [card]
  (let [[rnk _] card]
    (Integer/valueOf
      (if (Character/isDigit rnk)
        (str rnk)
        (face-cards rnk)))))

(defn hand-ranks [hand]
  vals (map rank hand))

(defn rank-combos [hand]
  (vals (frequencies (hand-ranks hand))))

(defn suit [card]
  (let [[_ sui] card]
    (str sui)))

(defn hand-suits [hand]
  vals (map suit hand))

(defn x-of-a-kind? [hand, x]
  (contains?
    (set (rank-combos hand))
    x))


(defn pair? [hand]
  (x-of-a-kind? hand 2))

(defn three-of-a-kind? [hand]
  (x-of-a-kind? hand 3))

(defn four-of-a-kind? [hand]
  (x-of-a-kind? hand 4))

(defn flush? [hand]
  (= 1 (count (frequencies (hand-suits hand)))))


(defn full-house? [hand]
  (= [2 3] (sort (rank-combos hand))))

(defn two-pairs? [hand]
  (= 2
     (count (filter (fn [x] (= x 2))
       (rank-combos hand)))))

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
