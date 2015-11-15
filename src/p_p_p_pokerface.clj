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
  nil)

(defn pair? [hand]
  nil)

(defn three-of-a-kind? [hand]
  nil)

(defn four-of-a-kind? [hand]
  nil)

(defn flush? [hand]
  nil)

(defn full-house? [hand]
  nil)

(defn two-pairs? [hand]
  nil)

(defn straight? [hand]
  nil)

(defn straight-flush? [hand]
  nil)

(defn value [hand]
  nil)
