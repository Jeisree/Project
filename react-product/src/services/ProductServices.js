import axios from 'axios'

const PRODUCT_REST_API_URL='http://localhost:8081/productslist'
class ProductServices {

    getProducts() {
        return axios.get(PRODUCT_REST_API_URL);
    }

}
export default new ProductServices();