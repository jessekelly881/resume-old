(ns site.core
  (:require [goog.dom :as gdom]
            [reagent.dom :as dom]
            [stylefy.core :as stylefy :refer [use-style]]))

(stylefy/init)

(defn page-divider []
  [:div.pageDivider])

(defn site-title [text]
  [:h1.siteTitle text])

(defn page [& children]
  [:section.page children])

(defn site-footer []
  [:footer.siteFooter
   [:span "Footer"]
   ])

(defn page-title [text]
  [:h2.pageTitle text])

(defn page-sub-title [text]
  [:h3.pageSubTitle text])

(defn top-page []
  [:section.topPage
     [site-title "Jesse Kelly"]
     [page-sub-title "Your problem solver"]
  ])

(defn hire-me-page []
  [:section (use-style {:background-color "#F2AA8085" :height "45vh"})
   [page
    [page-title "Hire Me!"]
    ]
   ])

(defn footer []
  [:section (use-style {:margin-top "20px" :text-align "center"})
   [:small "Built using Clojurescript!"]]
  )

(defn app []
  [:div
   [:title "Jesse Kelly"]
   [top-page]
   [page
       [page-title "Profile"]
   ]

   [page-divider]

   [page
       [page-title "Education"]
   ]

   [page-divider]

   [page
       [page-title "Experience"]
   ]

   [page-divider]

   [page
       [page-title "Abilities"]
       [page-sub-title "Skills"]
       [page-sub-title "Languages"]
       [page-sub-title "Tools"]
   ]

   [page-divider]

   [page
       [page-title "Projects"]
   ]

   [hire-me-page]
   [footer]

   ]
  )

(dom/render [app] (gdom/getElement "app"))
