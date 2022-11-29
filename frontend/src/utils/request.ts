import axios, { AxiosRequestConfig } from "axios";

export const BASE_URL = import.meta.env.VITE_BACKEND_URL ?? "http://localhost:8080";

export const requestBackend = (config: AxiosRequestConfig) => {
    const headers = config.headers;

    return axios({ ...config, baseURL: BASE_URL, headers });
};