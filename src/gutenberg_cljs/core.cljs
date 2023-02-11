(ns ^:figwheel-hooks gutenberg-cljs.core
  (:require
   [goog.dom :as gdom]
   [reagent.core :as r]
   ["react-dom/client" :refer [createRoot]]
   ["@wordpress/blocks" :as blocks]))

(defonce root (createRoot (gdom/getElement "app")))

(defn hello-world []
  [:div
   [:h1 "Hello Reagent!"]])

(defn mount [el]
  (.render el (r/as-element [hello-world])))

(mount root)
