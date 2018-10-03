
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form id="regForm" modelAttribute="user" action="generate-invoice" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <label path="Name">Name</label>
                        </td>
                        <td>
                            <input path="username" name="username" id="username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label path="Product">Product</label>
                        </td>
                        <td>
                            <input path="productName" name="productName" id="productName" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label path="Price">Price</label>
                        </td>
                        <td>
                            <input path="price" name="price" id="price" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label path="email">Email</label>
                        </td>
                        <td>
                            <input path="email" name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label path="address">Address</label>
                        </td>
                        <td>
                            <input path="address" name="address" id="address" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label path="phone">Phone</label>
                        </td>
                        <td>
                            <input path="phone" name="phone" id="phone" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label path="Date Of Purchase">Date Of Purchase</label>
                        </td>
                        <td>
                            <input path="dop" name="dop" id="dop" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button id="generate" name="generate">Generate Invoice</button>
                        </td>
                    </tr>
                    <tr></tr>
                </table>
            </form>
        </body>
        </html>