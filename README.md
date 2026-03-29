# 🚪 GoDrive - API Gateway Server

## 1. Overview
The **API Gateway** is the central entry point for the **GoDrive** system, responsible for routing requests to the appropriate backend microservices.

## 2. Routing Configuration
The Gateway dynamically routes traffic to the following services:
* `/api/v1/vehicles/**` -> **Vehicle Service** (MySQL)
* `/api/v1/customers/**` -> **Customer Service** (MySQL)
* `/api/v1/bookings/**` -> **Booking Service** (MongoDB)

---

## 3. Technology Stack
* **Language:** Java 25
* **Framework:** Spring Cloud API Gateway
* **Discovery:** Eureka Discovery Client

---

## 4. Deployment & Reliability
* **Process Management:** Managed by **PM2** to ensure 100% uptime.
* **Externalized Config:** Connects to the Config Server at startup to fetch routing rules.

---

## 5. How to Access
* **Base URL:** `http://34.93.114.63:80`
