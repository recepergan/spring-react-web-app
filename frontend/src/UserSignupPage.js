import React from 'react';

class UserSignupPage extends React.Component {

    state = {
        username: null,
        displayName:null,
        password:null,
        passwordRepeat:null,
    //    agreedClicked: false
    }

    onChange = event => {

        const{name, value } = event.target; //object destructuring

        // const value = event.target.value;
        // const name = event.target.name;
        this.setState({
            [name]: value })

    }

    // onChangeUsername = event => {
    //     // console.log(event.target.value);
    //     // this.state.username = event.target.value;
    //     // console.log(this.state);
    //     this.setState({
    //         username: event.target.value
    //     })
    // }
    // onChangeDisplayName = event => {
        
    //     this.setState({
    //         displayName: event.target.value
    //     })
    // }
    // onChangePassword = event => {
        
    //     this.setState({
    //         password: event.target.value
    //     })
    // }
    // onChangePasswordRepeat = event => {
        
    //     this.setState({
    //         passwordRepeat: event.target.value
    //     })
    // }

    // onChange = event => {
    //     // this.state.agreedClicked = event.target.checked;
    //     // console.log(this.state);
    //     this.setState({
    //         agreedClicked:event.target.checked
    //     });
    // }

    render() {
        return (
            <form>
                <h1>Sign Up</h1>
                <div>
                <label>Username</label>
                <input name = "username" onChange={this.onChange}/>
                </div>
                <div>
                <label>Display Name</label>
                <input name = "displayName" onChange={this.onChange}/>
                </div>
                <div>
                <label>password</label>
                <input name = "password" type= "password" onChange={this.onChange}/>
                </div>
                <div>
                <label>password Repeat</label>
                <input name = "passwordRepeat" type= "password" onChange={this.onChange}/>
                </div>
                {/* <input type = "checkBox" onChange={this.onChangeAgreee} />Agreed
                <button disabled = {!this.state.agreedClicked}>Sign Up</button> */}
              <button>Sign Up</button>
            </form>
            
        );
    }
}

export default UserSignupPage;