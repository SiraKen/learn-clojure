;; https://github.com/dakrone/clj-http
(require
 '[clj-http.client :as client])

;; GET
;; TODO: Required: https://github.com/dakrone/cheshire for using :as :json
;; (println (client/get "https://sample.novalumoapis.com/api/uses" {:accept :json :as :auto :async? true}
;;                      (fn [response] (println "response is: " response))
;;                      (fn [exception] (println "exeption is: " (.getMessage exception)))))

;; POST
(println (client/post "https://sample.novalumoapis.com/api/todos"
                      {:form-params {:user_id 1 :title "From SiraKen's Clojure Program" :completed 1}
                       :accept :json}))

;; (def todo-id 53)

;; PUT
;; (println (client/put (str "https://sample.novalumoapis.com/api/todos/" todo-id)
;;                      {:form-params {:title "Modified: from SiraKen's Clojure Program"}
;;                       :accept :json}))

;; DELETE
;; (println (client/delete (str "https://sample.novalumoapis.com/api/todos/" todo-id)
;;                         {:accept :json}))