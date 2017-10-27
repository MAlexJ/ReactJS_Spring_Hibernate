import React from 'react';

// Main class
class App extends React.Component {
    render() {

        return (
            <div>
                <Header/>
                <Content/>
            </div>
        );
    }
}

class Header extends React.Component {

    handleEvent() {
        alert(`I am an event handler.
      If you see this message,
      then I have been called.`);
    }

    render() {
        return (
            <div>
                <h2>Header</h2>
                <h4 onClick={this.handleEvent} >Click !</h4>
            </div>
        );
    }
}

class Content extends React.Component {

    render() {
        return (
            <div>
                <h3>Content</h3>
                <p>The content text!!!21242124</p>
            </div>
        );
    }
}

// on the end
export default App;