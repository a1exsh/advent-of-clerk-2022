;; # 🎄 Advent of Clerk: 2022

;; [Advent of Code](https://adventofcode.com) with
;; [Clerk](https://clerk.vision).
(ns advent-of-clerk.year-2022.index
  {:nextjournal.clerk/visibility {:code :hide :result :hide}}
  (:require [babashka.fs :as fs]
            [clojure.string :as str]
            [nextjournal.clerk :as clerk]
            [advent-of-clerk.index :as index]))

^{::clerk/no-cache true
  ::clerk/visibility {:result :show}}
(index/render-toc (index/build-paths-for-year "year_2022")
                  3)
