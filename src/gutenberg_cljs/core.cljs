(ns ^:figwheel-hooks gutenberg-cljs.core
  (:require
   [goog.dom :as gdom]
   [reagent.dom :as rdom]))

(defn get-app-element []
  (gdom/getElement "app"))

(defn hello-world []
  [:div
   [:h1 "Hello Reagent!"]])

(defn mount [el]
  (rdom/render [hello-world] el))

(mount (get-app-element))
