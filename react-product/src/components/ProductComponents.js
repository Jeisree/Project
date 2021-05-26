import React from 'react';
import productservice from '../services/ProductServices';
import {Navbar, Nav,Form,FormControl,Button}  from 'react-bootstrap';

class ProductComponents extends React.Component {

    constructor(props) {
        super(props)
        this.state= {
            products:[]
        }
    }
        componentDidMount() {
            productservice.getProducts().then((Response)=> {
                this.setState({products:Response.data})
            });

        }
        render() {
            return(
                <div>
                    
                    <h1 className = "text-center">Products List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Category</th>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.products.map(
                                product =>
                                <tr key = {product.id}>
                                    <td>{product.id}</td>
                                    <td>{product.name}</td>
                                    <td>{product.price}</td>
                                    <td>{product.category}</td>
                                </tr>
                            )
                            }
                    </tbody>
                </table>
                </div>
            )
        }
    

}
export default ProductComponents