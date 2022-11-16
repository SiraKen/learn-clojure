(ns http
  (:require
   [clj-http.client :as client]))

;; GET
(println (client/get "https://sample.novalumoapis.com/api/users"
                     {:accept :json :as :json :async? true}
                     (fn [response] (println response))
                     (fn [exception] (println (.getMessage exception)))))

;; POST
;; (println (client/post "https://sample.novalumoapis.com/api/todos"
;;                       {:form-params {:user_id 1 :title "From SiraKen's Clojure Program" :completed 1}
;;                        :accept :json}))

;; PUT
;; (println (client/put (str "https://sample.novalumoapis.com/api/todos/" 0)
;;                      {:form-params {:title "Modified: from SiraKen's Clojure Program"}
;;                       :accept :json}))

;; DELETE
;; (println (client/delete (str "https://sample.novalumoapis.com/api/todos/" todo-id)
;;                         {:accept :json}))