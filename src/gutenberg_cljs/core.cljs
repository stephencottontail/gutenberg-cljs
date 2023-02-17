(ns ^:figwheel-hooks gutenberg-cljs.core
  (:require
   [goog.dom :as gdom]
   [reagent.core :as r]
   ["react-dom/client" :refer [createRoot]]
   [moment]
   ["@wordpress/blocks" :refer [registerBlockType]]))

(defn hello-reagent []
  [:div
   [:h1 "Hello Reagent!"]])

(println (str "Hello " (.format (moment) "dddd")))

(registerBlockType "gutenberg-cljs/embed" (js-obj "title" "Notes Embed"
                                                  "category" "embed"
                                                  "icon" "embed-generic"
                                                  "edit" hello-reagent
                                                  "save" hello-reagent))

(comment
  (defonce root (createRoot (gdom/getElement "app")))

  (defn mount [el]
    (.render el (r/as-element [hello-world])))

  (mount root))
